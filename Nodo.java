package lista;

public class Nodo {
    private int info;
    private Nodo nodo;

    /**
     *
     */
    public Nodo() {
        // TODO Auto-generated constructor stub
        creaNodo(0, null);
    }

    public Nodo(int info) {
        this.info = info;
        nodo = null;
    }


	public Nodo(Nodo nodo){
		this.info = nodo.getInfo();
		this.nodo = nodo.getLinkNodo();
	}

    private void creaNodo(int i, Nodo link) {
        this.info = i;
        this.nodo = link;

        //System.out.println("Nodo n:" + i + " link:" + link + " creato!");

    }

    public void setInfoNodo(int i) {
        this.info = i;
    }

    public int getInfoNodo() {
        return info;
    }

    public void setLinkNodo(Nodo link) {
        this.nodo = link;
    }

    public Nodo getLinkNodo() {
        return this.nodo;
    }

    public int visualizza() {
        return getInfoNodo();
    }

}
