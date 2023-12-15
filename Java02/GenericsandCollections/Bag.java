package GenericsandCollections;

//This is the genarry T
public class Bag<T> {
    private T content;

    public T getContent(){
        return content;
    }

    public void setContent(T content){
        this.content = content;
    }
}
