package sbadc.Watcher;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;

public class Watcher {
	public static JDA jda;
	public static final String prefix = "/";
	
	@SuppressWarnings("deprecation")
	public static void main(String... args) throws LoginException{
		jda = new JDABuilder(AccountType.BOT)
				.setToken("NzEzNjQ2MTE5MjA0MjkwNTgx.XsjJfw.hOND0eatG5TbX0GiwgT1zHlbxrc")
				.build();
		jda.getPresence().setStatus(OnlineStatus.ONLINE);
		
		jda.addEventListener(new Commands());
		jda.addEventListener(new JoinEvent());
		jda.addEventListener(new MemberLeaved());
		jda.addEventListener(new MessageReceived());
	}
}
