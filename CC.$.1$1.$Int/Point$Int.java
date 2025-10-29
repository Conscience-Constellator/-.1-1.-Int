package CC.$.Q$Q;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

//import CC.$.Q$Q_LMNt.Point$Q;
//import CC.$.Q$Q_LMNt.Q$Int;
import java.util.Collection;

public interface Point$Int<In_Typ> //extends
//	Point$Q<In_Typ>,
//	Q$Int
{
//	Clas_Rap Class=Init_StRt_Nd(Point$Int.class,
//		Clas_Rap.class
//	);/*Dep ?done*/

	@Lin_DclAr
	int Point$Int(In_Typ In);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default <In extends In_Typ>void Pointg$Intg(In[] From,int[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=Point$Int(From[IndX]);}}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default <In extends In_Typ>int[] Pointg$Intg(In[] From)
			{
				int[] Out=new int[From.length];
				Pointg$Intg(From,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default <In extends In_Typ>void Pointg$Intg(Iterable<In> From,Collection<Integer> To){for(In In:From){To.add(Point$Int(In));}}
}