package sbadc.Watcher;

import java.util.Random;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class JoinEvent extends ListenerAdapter{
	String[] messages = {
			"[member] joined. You must verify your account.",
			"Never gonna give [member] up, Please Verify at verify page.",
			"[member] is new member, please verify.",
			"Thanks for joining [member].",
			"Nice to see you [member].",
			"Welcome [member].",
			"You are welcomed [member].",
			"We were just waiting for you [member]. please verify.",
			"[member] joined the server, please verify.",
			"[member] just joined the server. You have to verify [member]."
	};
	
	public void onGuildMemberJoin(GuildMemberJoinEvent event) {
		Random random = new Random();
		int number = random.nextInt(messages.length);
		EmbedBuilder welcome = new EmbedBuilder();
		welcome.setColor(0x66d8ff);
		welcome.setDescription(messages[number].replace("[member]", event.getMember().getAsMention()));
		event.getGuild().getDefaultChannel().sendMessage(welcome.build()).queue();
		
		//add role to new member...
		event.getGuild().addRoleToMember(event.getMember(),(Role) event.getGuild().getRolesByName("UVMember",false)).complete();
	
	}
	
}
