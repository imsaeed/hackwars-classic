package Hacktendo.Functions;


import java.util.ArrayList;
import Hackscript.Model.*;
import Hacktendo.*;

public class GetWidth extends LinkerFunctions{

	private RenderEngine RE;
	private HacktendoLinker HL;
	public GetWidth(RenderEngine RE,HacktendoLinker HL){
		this.RE=RE;
		this.HL=HL;
	}
	
	public Object execute(ArrayList parameters){
		if(parameters.size()>0){
			int id = (int)(Integer)((TypeInteger)parameters.get(0)).getRawValue();
			Sprite MySprite=RE.getSprite(id);
			int width = MySprite.getWidth();
			return(new TypeInteger(width));
			
		}else{
			int spriteID = HL.getSpriteID();
			Sprite MySprite=RE.getSprite(spriteID);
			int width = MySprite.getWidth();
			return(new TypeInteger(width));
		}
	}
}
