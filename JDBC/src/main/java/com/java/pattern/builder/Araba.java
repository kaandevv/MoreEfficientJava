package com.java.pattern.builder;

public class Araba {
    private Integer id;
    private String name;
    private Integer price;
    private String color;

    public Araba() {
    }

    public Araba(ArabaBuilder arabaBuilder) {
        this.color = arabaBuilder.color;
        this.id = arabaBuilder.id;
        this.price = arabaBuilder.price;
        this.name = arabaBuilder.name;
    }

    static class ArabaBuilder {
        private Integer id;
        private String name;
        private Integer price;
        private String color;

        public ArabaBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public ArabaBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ArabaBuilder setPrice(Integer price) {
            this.price = price;
            return this;
        }

        public ArabaBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Araba build() {
            return new Araba(this);
        }
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id:" + id);
        stringBuilder.append("name:" + name);
        stringBuilder.append("price:" + price);
        stringBuilder.append("color:" + color);

        return stringBuilder.toString();


    }
}
