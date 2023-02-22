public class Item {
    ItemType type;
    int value = 0;

    public int getvalue(){
        return this.value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public ItemType getType(){
        return this.type;
    }

    public void setType(ItemType type){
         this.type = type;
    }
}
