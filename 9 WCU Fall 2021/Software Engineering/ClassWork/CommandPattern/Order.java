public interface Order {
   
   abstract public void execute();
   abstract public void undo();
   abstract public void redo();

}