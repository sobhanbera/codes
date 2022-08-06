package sbadc.Watcher;

import java.util.Random;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.guild.member.GuildMemberLeaveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

@SuppressWarnings("deprecation")
public class MemberLeaved extends ListenerAdapter{
	String[] messages = {
			"[member] left, i think he will lose something important."
	};
	
	public void onGuildMemberLeave(GuildMemberLeaveEvent event) {
		Random random = new Random();
		int number = random.nextInt(messages.length);
		EmbedBuilder welcome = new EmbedBuilder();
		welcome.setColor(0xf48342);
		welcome.setDescription(messages[number].replace("[member]", event.getMember().getAsMention()));
		event.getGuild().getDefaultChannel().sendMessage(welcome.build()).queue();
	}
}
