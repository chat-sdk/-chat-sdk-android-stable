package sdk.chat.core.module;

import android.content.Context;

import androidx.annotation.NonNull;

import sdk.chat.core.handlers.MessageHandler;

/**
 * Created by SimonSmiley-Andrews on 01/05/2017.
 */

public interface Module {
    void activate(@NonNull Context context);
    String getName();

    MessageHandler getMessageHandler();

}