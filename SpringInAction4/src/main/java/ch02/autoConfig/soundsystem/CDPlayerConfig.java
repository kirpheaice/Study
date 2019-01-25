package ch02.autoConfig.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
@ComponentScan(basePackages={"aa","ch02.autoConfig.soundsystem"})
//@ComponentScan(basePackageClasses={CDPlayer.class})
public class CDPlayerConfig
{

}
