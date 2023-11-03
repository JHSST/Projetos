import java.io.Serializable;
import java.util.Date;

class Site implements Serializable {
    private static final long serialVersionUID = 1L;
    private String descricao;
    private String url;
    private Date dataCadastro;

    public Site(String descricao, String url, Date dataCadastro) {
        this.descricao = descricao;
        this.url = url;
        this.dataCadastro = dataCadastro;
    }

    public String getDescricao() { return descricao; }
    public String getUrl() { return url; }
    public Date getDataCadastro() { return dataCadastro; }
}