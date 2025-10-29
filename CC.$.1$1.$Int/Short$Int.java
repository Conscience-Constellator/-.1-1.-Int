package CC.$.Q$Q;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

//import CC.$.Q$Q_LMNt.Q$Int;
//import CC.$.Q$Q_LMNt.Short$Q;
import java.util.Collection;

public interface Short$Int //extends
//	Short$Q,
//	Q$Int
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Short$Int.class,
		Clas_Rap.class);
	/*Dep ?done*/

	@Lin_DclAr
	int Short$Int(short In);
		@Lin_DclAr@Neds_Ovrid(NEds=No)
		default void Shortg$Intg(
			short[] From,
			int[] To)
		{
			for(int IndX=0;
				IndX<From.length;
				IndX+=1)
			{
				To[IndX]=(Short$Int(
				From[IndX]));
			}
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No)
			default int[] Shortg$Intg(short[] In)
			{
				int[] Out=new int[In.length];

				Shortg$Intg(In,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Shortg$Intg(
			Iterable<Short> From,
			Collection<Integer> To)
		{
			for(short In:From)
			{To.add(Short$Int(In));}
		}
}