package com.quickblox.sample.videochatwebrtcnew;

import com.quickblox.videochat.webrtc.QBRTCSession;

/**
 * Created by tereha on 10.07.15.
 */
public class SessionManager {

    private static volatile QBRTCSession currentSession;

    public synchronized static QBRTCSession getCurrentSession() {
        return currentSession;
    }

    public synchronized static void setCurrentSession(QBRTCSession qbCurrentSession) {
        currentSession = qbCurrentSession;
    }
}