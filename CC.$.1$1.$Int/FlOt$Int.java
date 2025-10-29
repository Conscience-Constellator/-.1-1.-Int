package CC.$.Q$Q;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

//import CC.$.Q$Q_LMNt.Flot$Q;
//import CC.$.Q$Q_LMNt.Q$Int;
import java.util.Collection;

public interface FlOt$Int //extends
//	Flot$Q,
//	Q$Int
{
	/*
	Clas_Rap Class=Init_StRt_Nd(FlOt$Int.class,
		Clas_Rap.class);
	/*Dep ?done*/

	@Lin_DclAr
	int Flot$Int(float In);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Flotg$Intg(float[] From,int[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Flot$Int(From[IndX]));}}
			@Lin_DclAr @Neds_Ovrid(NEds=No)
			default int[] Flotg$Intg(float[] In)
			{
				int[] Out=new int[In.length];

				Flotg$Intg(In,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Flotg$Intg(
			Iterable<Float> From,
			Collection<Integer> To)
		{
			for(float In:From)
			{To.add(Flot$Int(In));}
		}
}