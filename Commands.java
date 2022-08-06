package sbadc.Watcher;

import java.util.List;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter{
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		
		if(args[0].equalsIgnoreCase(Watcher.prefix + "clear")) {
			if(args.length < 2) {
				EmbedBuilder work = new EmbedBuilder();
				work.setColor(0xff3923);
				work.setTitle("Specify the amount❔");
				work.setDescription("Use: `" + Watcher.prefix + "clear [amount of messages]`");
				event.getChannel().sendMessage(work.build()).queue();
			}else {
				try {
					List<Message> messages = event.getChannel().getHistory().retrievePast(Integer.parseInt(args[1])).complete();
					event.getChannel().deleteMessages(messages).queue();
					EmbedBuilder complete = new EmbedBuilder();
					complete.setColor(0x22ff2a);
					complete.setTitle("✅Successfully Deleted " + args[1] + " messages.");
					complete.setDescription("Use: `" + Watcher.prefix + "clear [amount of messages]`");
					event.getChannel().sendMessage(complete.build()).queue();
				}catch(IllegalArgumentException e) {
					if(e.toString().startsWith("java.lang.IllegalArgumentException: Message retrieval")) {
						EmbedBuilder error = new EmbedBuilder();
						error.setColor(0xff3923);
						error.setTitle("🔴Too many messages can't be deleted");
						error.setDescription("Please set a limit of deleting messages between 1-75");
						event.getChannel().sendMessage(error.build()).queue();
					}else {
						EmbedBuilder error = new EmbedBuilder();
						error.setColor(0xff3923);
						error.setTitle("🔴Too old messages can't be deleted");
						error.setDescription("Please select new messages to be deleted");
						event.getChannel().sendMessage(error.build()).queue();
					}
				}
			}
		}
		
		if(args[0].equalsIgnoreCase(Watcher.prefix + "verify")) {
			EmbedBuilder info = new EmbedBuilder();
			info.setTitle("🎮Verifying Info🎮");
			info.setDescription(event.getMember().getUser().getName() + ", you account is now verified successfully");
			//info.addField("Developer","Sobhan Bera",false);
			info.setColor(0xf45642);
			info.setFooter("Created By SBADC", event.getMember().getUser().getAvatarUrl());
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(info.build()).queue();
			info.clear();
		}
	}
}
