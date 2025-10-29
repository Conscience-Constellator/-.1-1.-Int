package CC.$.Q$Q;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

//import CC.$.Q$Q_LMNt.Long$Q;
//import CC.$.Q$Q_LMNt.Q$Int;
import java.util.Collection;

public interface Long$Int //extends
//	Long$Q,
//	Q$Int
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Long$Int.class,
		Clas_Rap.class);
	/*Dep ?done*/

	@Lin_DclAr
	int Long$Int(long In);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Longg$Intg(long[] From,int[] To)
		{for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Long$Int(From[IndX]));}}
			@Lin_DclAr @Neds_Ovrid(NEds=No)
			default int[] Longg$Intg(long[] In)
			{
				int[] Out=new int[In.length];
				Longg$Intg(In,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Longg$Intg(
			Iterable<Long> From,
			Collection<Integer> To)
		{
			for(long In:From)
			{To.add(Long$Int(In));}
		}
}