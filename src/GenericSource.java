import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class GenericClass<T,U>{
	    T x;
	    U y;
	public void display() {
		System.out.println("The value of x "+ x +"y"+ y);
	}
}
public class GenericSource {
	
	public static void main(String[] args) {
		GenericClass<Integer,String> obj1 = new GenericClass();
obj1.x=53;
obj1.y="Ramya";
System.out.println(obj1.x);
System.out.println(obj1.y);
}
}