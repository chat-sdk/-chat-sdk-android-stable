package sdk.chat.message.audio;

import android.view.View;

import butterknife.BindView;
import sdk.chat.ui.view_holders.base.BaseIncomingTextMessageViewHolder;

public class IncomingAudioMessageViewHolder extends BaseIncomingTextMessageViewHolder<AudioMessageHolder> {

    @BindView(R2.id.audioPlayerView) protected AudioPlayerView audioPlayerView;

    public IncomingAudioMessageViewHolder(View itemView, Object payload) {
        super(itemView, payload);
    }

    @Override
    public void onBind(AudioMessageHolder message) {
        super.onBind(message);
        audioPlayerView.bind(message.audioURL(), message.getTotalTime());
    }
}
