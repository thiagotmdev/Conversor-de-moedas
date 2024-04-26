package Conversor;

import Modelos.InfoConversao;
import Modelos.InfoTipos;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
   private String chave = "Sua Chave aqui";

   private String moeda1;
   private String moeda2;
   private double valor = 0;

   protected void setValor(double valor) {
      this.valor = valor;
   }


   protected void setMoeda2(String moeda2) {
      this.moeda2 = moeda2;
   }

   protected void setMoeda1(String moeda1) {
      this.moeda1 = moeda1;
   }

   protected void converter() throws IOException, InterruptedException {
      String dominioApi = "https://v6.exchangerate-api.com/v6/"+ chave +"/pair/"+ moeda1+"/"+ moeda2 +"/"+ valor;

      try {
         HttpClient client = HttpClient.newHttpClient();
         HttpRequest request = HttpRequest.newBuilder()
                 .uri(URI.create(dominioApi))
                 .build();
         HttpResponse<String>response = client.send(request, HttpResponse.BodyHandlers.ofString());


         String json = response.body();

         Gson gson = new Gson();
         InfoTipos meusTipos = gson.fromJson(json, InfoTipos.class);
         //System.out.println(meusTipos);
         InfoConversao minhasInfos = new InfoConversao(meusTipos);
         System.out.println("************* Conversão *************\n");
         System.out.println("Sua moeda: " + minhasInfos.getSuaMoeda() + "\n");
         System.out.println("Moeda para converter: " + minhasInfos.getMoedaParaConverter() + "\n");
         System.out.println("Taxa de conversão: " + minhasInfos.getTaxaDeConversao() + "\n");
         System.out.println("Valor já convertido: " + minhasInfos.getValorConvertido() + "\n");

      }catch(RuntimeException e){
         System.out.println("Houve um erro na solicitação, tente novamente ou contacte o administrador do," +
                 "sistema!");
      }
   }
}
