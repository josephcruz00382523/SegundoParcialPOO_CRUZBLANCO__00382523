import java.util.ArrayList;

public class composite implements component{
    ArrayList<component> children = new ArrayList<>();

    public addChildren(){
        children.add(();
    }
    public removeComponent(int position){
        children.remove(position);

    }

    public component getChildren(int position){
        return children.get(position);
    }
    @Override
    public void execute() {

    }
}
