package CC.$.Q$Q;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

//import CC.$.Q$Q_LMNt.ChR$Q;
//import CC.$.Q$Q_LMNt.Q$Int;
import java.util.Collection;

public interface ChR$Int //extends
//	ChR$Q,
//	Q$Int
{
	/*
	Clas_Rap Class=Init_StRt_Nd(ChR$Int.class,
		Clas_Rap.class);
	/*Dep ?done*/

	@Lin_DclAr
	int ChR$Int(char In);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void ChRg$Intg(
			char[] From,
			int[] To)
		{
			for(int IndX=0;
				IndX<From.length;
				IndX+=1)
			{
				To[IndX]=(ChR$Int(
				From[IndX]));
			}
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No)
			default int[] ChRg$Intg(char[] In)
			{
				int[] Out=new int[In.length];

				ChRg$Intg(In,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void ChRg$Intg(
			Iterable<Character> From,
			Collection<Integer> To)
		{
			for(char In:From)
			{To.add(ChR$Int(In));}
		}
}