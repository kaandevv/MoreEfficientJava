package ders2;

import java.util.List;
import java.util.Vector;

public interface InterfaceDeneme {
    int size();

    String toStringUpper(String var);

}

class DenemeImplementation implements InterfaceDeneme {
    List<String> deneme = new Vector<>();

    DenemeImplementation() {
        deneme.add("124312");
        deneme.add("124312");
        deneme.add("124312");
        deneme.add("124312");

    }

    public void customFunction() {
        System.out.println("sadece impl metoduna ait");
    }

    @Override
    public int size() {
        return deneme.size();
    }

    @Override
    public String toStringUpper(String var) {
        return var.toUpperCase();
    }
}


class DenemeImplementation2 implements InterfaceDeneme {
    List<String> deneme = new Vector<>();

    DenemeImplementation2() {
        deneme.add("124312");
        deneme.add("124312");
        deneme.add("124312");
        deneme.add("124312");

    }

    public void customFunction() {
        System.out.println("sadece impl2 metoduna ait");
    }

    @Override
    public int size() {
        return deneme.size();
    }

    @Override
    public String toStringUpper(String var) {
        return var.toUpperCase();
    }
}

class TestDeneme {
    public static void main(String[] args) {
        DenemeImplementation denemeImplementation = new DenemeImplementation();
        denemeImplementation.customFunction();
    }
}