import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.Set;

public class Moeda {
    private String moedaP;
    private Set<String> moedaF;
    private double convert;

    public Moeda(String json){
        JsonObject object = JsonParser.parseString(json).getAsJsonObject();
        this.moedaP = object.get("base").getAsString();
        JsonObject moeda = object.get("result").getAsJsonObject();
        this.moedaF = moeda.keySet();
        this.convert = moeda.get(this.moedaF.iterator().next()).getAsDouble();
    }

    @Override
    public String toString() {
        return "Moeda: " + this.moedaP + " para Moeda: " + this.moedaF.iterator().next() + ", Taxa de conversão: " + this.convert;
    }

    public double getConvert() {
        return convert;
    }

    public double convertE(double valor){
        return valor * this.convert;
    }
}
