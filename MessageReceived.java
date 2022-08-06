package sbadc.Watcher;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageReceived extends ListenerAdapter{
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		
		if(args[0].equalsIgnoreCase(Watcher.prefix+"mute")) {
			if(args.length > 1 && args.length < 3) {
				Member member = event.getGuild().getMemberById(args[1].replace("<@", "").replace(">", ""));
				Role role = event.getGuild().getRoleById("713693195057496125");
				if(!member.getRoles().contains(role)) {
					//mute user
					event.getChannel().sendMessage("Muted "+args[1]+".").queue();
					event.getGuild().addRoleToMember(member, role).complete();
				}else {
					//unmute user
					event.getChannel().sendMessage("Unmuted "+args[1]+".").queue();
					event.getGuild().removeRoleFromMember(member, role).complete();
				}
				
			}else if(args.length == 3){
				
			}else {
				EmbedBuilder work = new EmbedBuilder();
				work.setColor(0xff3923);
				work.setTitle("Specify Correctly");
				work.setDescription("Use: `" + Watcher.prefix + " mute; [user mentioned name] [time]`");
				event.getChannel().sendMessage(work.build()).queue();
			}
		}
	}
}
