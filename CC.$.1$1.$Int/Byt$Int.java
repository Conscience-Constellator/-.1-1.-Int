package CC.$.Q$Q;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

//import CC.$.Q$Q_LMNt.Byt$Q;
//import CC.$.Q$Q_LMNt.Q$Int;
import java.util.Collection;

public interface Byt$Int //extends
//	Byt$Q,
//	Q$Int
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Byt$Int.class,
		Clas_Rap.class);
	/*Dep ?done*/

	@Lin_DclAr
	int Byt$Int(byte In);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Bytg$Intg(
			byte[] From,
			int[] To)
		{
			for(int IndX=0;
				IndX<From.length;
				IndX+=1)
			{
				To[IndX]=(Byt$Int(
				From[IndX]));
			}
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No)
			default int[] Bytg$Intg(byte[] In)
			{
				int[] Out=new int[In.length];
				Bytg$Intg(In,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Bytg$Intg(
			Iterable<Byte> From,
			Collection<Integer> To)
		{
			for(byte In:From)
			{To.add(Byt$Int(In));}
		}
}