package com.example.y.mvp;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig newsTabNameInfoDaoConfig;
    private final DaoConfig newsListInfoDaoConfig;
    private final DaoConfig newsDetailInfoDaoConfig;
    private final DaoConfig imageTabNameInfoDaoConfig;
    private final DaoConfig imageListInfoDaoConfig;
    private final DaoConfig imageDetailInfoDaoConfig;
    private final DaoConfig jokePicInfoDaoConfig;
    private final DaoConfig jokeTextInfoDaoConfig;

    private final NewsTabNameInfoDao newsTabNameInfoDao;
    private final NewsListInfoDao newsListInfoDao;
    private final NewsDetailInfoDao newsDetailInfoDao;
    private final ImageTabNameInfoDao imageTabNameInfoDao;
    private final ImageListInfoDao imageListInfoDao;
    private final ImageDetailInfoDao imageDetailInfoDao;
    private final JokePicInfoDao jokePicInfoDao;
    private final JokeTextInfoDao jokeTextInfoDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        newsTabNameInfoDaoConfig = daoConfigMap.get(NewsTabNameInfoDao.class).clone();
        newsTabNameInfoDaoConfig.initIdentityScope(type);

        newsListInfoDaoConfig = daoConfigMap.get(NewsListInfoDao.class).clone();
        newsListInfoDaoConfig.initIdentityScope(type);

        newsDetailInfoDaoConfig = daoConfigMap.get(NewsDetailInfoDao.class).clone();
        newsDetailInfoDaoConfig.initIdentityScope(type);

        imageTabNameInfoDaoConfig = daoConfigMap.get(ImageTabNameInfoDao.class).clone();
        imageTabNameInfoDaoConfig.initIdentityScope(type);

        imageListInfoDaoConfig = daoConfigMap.get(ImageListInfoDao.class).clone();
        imageListInfoDaoConfig.initIdentityScope(type);

        imageDetailInfoDaoConfig = daoConfigMap.get(ImageDetailInfoDao.class).clone();
        imageDetailInfoDaoConfig.initIdentityScope(type);

        jokePicInfoDaoConfig = daoConfigMap.get(JokePicInfoDao.class).clone();
        jokePicInfoDaoConfig.initIdentityScope(type);

        jokeTextInfoDaoConfig = daoConfigMap.get(JokeTextInfoDao.class).clone();
        jokeTextInfoDaoConfig.initIdentityScope(type);

        newsTabNameInfoDao = new NewsTabNameInfoDao(newsTabNameInfoDaoConfig, this);
        newsListInfoDao = new NewsListInfoDao(newsListInfoDaoConfig, this);
        newsDetailInfoDao = new NewsDetailInfoDao(newsDetailInfoDaoConfig, this);
        imageTabNameInfoDao = new ImageTabNameInfoDao(imageTabNameInfoDaoConfig, this);
        imageListInfoDao = new ImageListInfoDao(imageListInfoDaoConfig, this);
        imageDetailInfoDao = new ImageDetailInfoDao(imageDetailInfoDaoConfig, this);
        jokePicInfoDao = new JokePicInfoDao(jokePicInfoDaoConfig, this);
        jokeTextInfoDao = new JokeTextInfoDao(jokeTextInfoDaoConfig, this);

        registerDao(NewsTabNameInfo.class, newsTabNameInfoDao);
        registerDao(NewsListInfo.class, newsListInfoDao);
        registerDao(NewsDetailInfo.class, newsDetailInfoDao);
        registerDao(ImageTabNameInfo.class, imageTabNameInfoDao);
        registerDao(ImageListInfo.class, imageListInfoDao);
        registerDao(ImageDetailInfo.class, imageDetailInfoDao);
        registerDao(JokePicInfo.class, jokePicInfoDao);
        registerDao(JokeTextInfo.class, jokeTextInfoDao);
    }
    
    public void clear() {
        newsTabNameInfoDaoConfig.getIdentityScope().clear();
        newsListInfoDaoConfig.getIdentityScope().clear();
        newsDetailInfoDaoConfig.getIdentityScope().clear();
        imageTabNameInfoDaoConfig.getIdentityScope().clear();
        imageListInfoDaoConfig.getIdentityScope().clear();
        imageDetailInfoDaoConfig.getIdentityScope().clear();
        jokePicInfoDaoConfig.getIdentityScope().clear();
        jokeTextInfoDaoConfig.getIdentityScope().clear();
    }

    public NewsTabNameInfoDao getNewsTabNameInfoDao() {
        return newsTabNameInfoDao;
    }

    public NewsListInfoDao getNewsListInfoDao() {
        return newsListInfoDao;
    }

    public NewsDetailInfoDao getNewsDetailInfoDao() {
        return newsDetailInfoDao;
    }

    public ImageTabNameInfoDao getImageTabNameInfoDao() {
        return imageTabNameInfoDao;
    }

    public ImageListInfoDao getImageListInfoDao() {
        return imageListInfoDao;
    }

    public ImageDetailInfoDao getImageDetailInfoDao() {
        return imageDetailInfoDao;
    }

    public JokePicInfoDao getJokePicInfoDao() {
        return jokePicInfoDao;
    }

    public JokeTextInfoDao getJokeTextInfoDao() {
        return jokeTextInfoDao;
    }

}