package proyect.myCar.library;
import proyect.myCar.logic.FreeWayComponent;


public interface IFactory 
{
	public FreeWayComponent createComponent(FreeWayComponentType pType); //Create FreeWayComponent
}
