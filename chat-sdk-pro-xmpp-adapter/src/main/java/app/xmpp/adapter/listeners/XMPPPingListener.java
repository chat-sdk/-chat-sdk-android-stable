package app.xmpp.adapter.listeners;

import org.jivesoftware.smackx.ping.PingFailedListener;
import org.tinylog.Logger;

public class XMPPPingListener implements PingFailedListener {
    @Override
    public void pingFailed() {
        Logger.debug("Ping Failed");
    }
}
