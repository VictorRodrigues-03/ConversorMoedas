import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Auxiliar {
    public Auxiliar() {
    }

    public void gravaArquivo(String other,String cep) throws IOException {
        try {
            FileWriter novoT = new FileWriter(cep + ".json");
            novoT.write(other);
            novoT.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public String buscaMoeda(String a,String b){
        String json = "";
        String endereco = "https://api.fastforex.io/fetch-one?from=" + a + "&to=" + b +"&api_key=9ce98446b0-41a3014507-sligld";
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            json = response.body();

        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Algum erro de argumento na busca, verifique o endereço");
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        return json;
    }
}
