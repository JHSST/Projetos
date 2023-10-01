class JSONFormatador implements Formatador {
    @Override
    public String formatar(Object objeto) {

        return "JSON: " + objeto.toString();
    }
}