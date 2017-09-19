package viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import cz.melkamar.redditlister.R;
import model.Post;
import model.SelfPost;

/**
 * Created by Martin Melka (martin.melka@gmail.com) on 18.09.2017 23:55.
 */

public class SelfpostViewHolder extends PostViewHolder {
    TextView title;
    SelfpostClickListener listener;

    public SelfpostViewHolder(View itemView, SelfpostClickListener listener) {
        super(itemView);
        title = itemView.findViewById(R.id.recycler_tv_title);
        this.listener = listener;
        itemView.setOnClickListener(this);
    }

    @Override
    public void bindItem(Post post) {
        SelfPost selfPost = (SelfPost) post;
        title.setText(selfPost.getTitle());
    }


    @Override
    public void onClick(View view) {
        listener.onSelfPostClick();
    }

    public interface SelfpostClickListener {
        void onSelfPostClick();
    }
}
