package com.example.parseinstagram;

import android.arch.paging.DataSource;

import com.example.parseinstagram.Model.Post;

public class ParseDataSourceFactory extends DataSource.Factory<Integer, Post> {

    @Override
    public DataSource<Integer, Post> create() {
        ParsePositionDataSource source = new ParsePositionDataSource();
        return source;
    }
}