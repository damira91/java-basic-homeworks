package ru.kudaiberdieva.homeworks.homework10;

public class Box {
    private final String size;
    private String color;
    public boolean isOpened;
    private String item;

    public Box(String size, String color, boolean isOpened, String item){
        this.size = size;
        this.color = color;
        this.isOpened = isOpened;
        this.item = item;
    }
    public void open(){
        if(isOpened){
        System.out.println("Box is already opened");
        }else{
            isOpened = true;
            System.out.println("Box is opened");
        }
    }
    public void close(){
        if(!isOpened){
            System.out.println("Box is already closed");
        }else{
            isOpened = false;
            System.out.println("Box is closed");
        }
    }
    public void changeColor(String newColor){
        color = newColor;
        System.out.println("Box is repainted in: " + newColor);
    }
    public void info(){
        System.out.println("Box size: "+ size +"\n" + "Box color: " + color);
        System.out.println("Box condition: " + (isOpened? "opened":"closed"));
        if(item == null){
            System.out.println("Box is empty");
        } else{
            System.out.println("Box contains: "+item);
        }
    }
    public void putItem(String item){
        if(this.item==null){
            this.item = item;
            System.out.println("Item " + item + " is in the box");
        }else{
            System.out.println("There is already an item in the box");
        }
    }
    public void throwItem(){
        if(this.item==null){
            System.out.println("Box is empty");
        }
        else{
            System.out.println(item + " is thrown from the box");
            this.item = null;

        }
    }

}
