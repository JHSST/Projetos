class XMLFormatador implements Formatador {
    @Override
    public String formatar(Object objeto) {

        return "XML: " + objeto.toString();
    }
}