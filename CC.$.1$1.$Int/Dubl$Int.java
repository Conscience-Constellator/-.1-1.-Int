package CC.$.Q$Q;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

//import CC.$.Q$Q_LMNt.Dubl$Q;
//import CC.$.Q$Q_LMNt.Q$Int;
import java.util.Collection;

public interface Dubl$Int //extends
//	Dubl$Q,
//	Q$Int
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Dubl$Int.class,
		Clas_Rap.class);
	/*Dep ?done*/

	@Lin_DclAr
	int Dubl$Int(double In);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Dublg$Intg(
			double[] From,
			int[] To)
		{
			for(int IndX=0;
				IndX<From.length;
				IndX+=1)
			{
				To[IndX]=(Dubl$Int(
				From[IndX]));
			}
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No)
			default int[] Dublg$Intg(double[] In)
			{
				int[] Out=new int[In.length];

				Dublg$Intg(In,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Dublg$Intg(
			Iterable<Double> From,
			Collection<Integer> To)
		{
			for(double In:From)
			{To.add(Dubl$Int(In));}
		}
}