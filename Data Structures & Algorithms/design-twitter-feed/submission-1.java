class Twitter {
    private HashMap<Integer, HashSet<Integer>> followers;
    private HashMap<Integer, List<PostAndTime>> posts;
    private static int count = 0;

    public Twitter() {
        followers = new HashMap<>();
        posts = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        posts.putIfAbsent(userId, new ArrayList<PostAndTime>());
        posts.get(userId).add(new PostAndTime(count++, tweetId));
    }

    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<PostAndTime> q = new PriorityQueue<>((a, b) -> b.count - a.count);
        HashSet<Integer> users;
        if (followers.get(userId) != null) {
            users = followers.get(userId);
        } else {
            users = new HashSet<>();
        }
        users.add(userId);
        for (Integer user : users) {
            if (posts.get(user) != null) {
                for (PostAndTime postT : posts.get(user)) {
                    q.add(postT);
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        int i = 0;
        while (!q.isEmpty() && i < 10) {
            res.add(q.poll().userId);
            i++;
        }

        return res;
    }

    public void follow(int followerId, int followeeId) {
        if (followers.get(followerId) == null) {
            followers.put(followerId, new HashSet<Integer>());
        }
        followers.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (followers.get(followerId) != null) {
            followers.get(followerId).remove(followeeId);
        }
    }
}

static class PostAndTime {
    int count;
    int userId;

    PostAndTime(int count, int userId) {
        this.count = count;
        this.userId = userId;
    }
}
