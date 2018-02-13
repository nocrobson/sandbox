package br.com.noc.sandbox.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "usuario_pkey", sequenceName = "usuario_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_pkey")
    @Column(name = "USUA_ID", unique = true, nullable = false)
    private int UsuaId;

    @Column(name = "USUA_NOME")
    private String UsuaNome;

    @Column(name = "USUA_LOGIN")
    private String UsuaLogin;

    @Column(name = "USUA_SENHA")
    private String UsuaSenha;

    @Column(name = "USUA_DT_CRIACAO")
    @Temporal(TemporalType.DATE)
    private Date UsuaDtCriacao;

    @Column(name = "USUA_STATUS")
    private String UsuaStatus;

    @Column(name = "USUA_ROLE")
    private String UsuaRole;

    public int getUsuaId() {
        return UsuaId;
    }

    public void setUsuaId(int usuaId) {
        UsuaId = usuaId;
    }

    public String getUsuaNome() {
        return UsuaNome;
    }

    public void setUsuaNome(String usuaNome) {
        UsuaNome = usuaNome;
    }

    public String getUsuaLogin() {
        return UsuaLogin;
    }

    public void setUsuaLogin(String usuaLogin) {
        UsuaLogin = usuaLogin;
    }

    public String getUsuaSenha() {
        return UsuaSenha;
    }

    public void setUsuaSenha(String usuaSenha) {
        UsuaSenha = usuaSenha;
    }

    public Date getUsuaDtCriacao() {
        return UsuaDtCriacao;
    }

    public void setUsuaDtCriacao(Date usuaDtCriacao) {
        UsuaDtCriacao = usuaDtCriacao;
    }

    public String getUsuaStatus() {
        return UsuaStatus;
    }

    public void setUsuaStatus(String usuaStatus) {
        UsuaStatus = usuaStatus;
    }

    public String getUsuaRole() {
        return UsuaRole;
    }

    public void setUsuaRole(String usuaRole) {
        UsuaRole = usuaRole;
    }
}
