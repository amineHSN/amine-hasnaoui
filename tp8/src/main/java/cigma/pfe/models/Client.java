package cigma.pfe.models;

import javax.persistence.*;


@Entity(name = "TClients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Nom")
    private String name;

    public Client(long id,String name){
        this.id=id;
        this.name=name;
    }

    public Client(){}

    public Client(String name){
        this.name=name;
    }
}