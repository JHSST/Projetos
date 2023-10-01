class YAMLFormatador implements Formatador {
    @Override
    public String formatar(Object objeto) {

        return "YAML: " + objeto.toString();
    }
}