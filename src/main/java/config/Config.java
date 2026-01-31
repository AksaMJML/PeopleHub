package config;

import org.modelmapper.ModelMapper;

public class Config {

public ModelMapper getMapping(){
    return new ModelMapper();
}
}
