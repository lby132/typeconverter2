package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

@Slf4j
public class StringToIpPortConverter implements Converter<String, IpPort> {

    @Override
    public IpPort convert(String source) {
        log.info("convert source={}", source);
        //IpPort 객체 -> "127.0.0.1:8080"
        final String[] split = source.split(":");
        final String ip = split[0];
        final Integer port = Integer.parseInt(split[1]);
        return new IpPort(ip, port);
    }
}
