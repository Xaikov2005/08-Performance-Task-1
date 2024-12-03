public class PlayerImplement implements Player{
    public String name;

    @Override
    public void setPlayer(String name) {
        this.name = name;
        
    }

    @Override
    public String getName() {
        return name;
        
    }
    
}
