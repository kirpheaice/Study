package ch02.javaConfig.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig
{
	@Bean
	public CompactDisc sgtPeppers()
	{
		return new SgtPeppers();
	}

	@Bean
	public CDPlayer cdPlayer(CompactDisc compackDisc)
	{
		return new CDPlayer(compackDisc);
	}
}
