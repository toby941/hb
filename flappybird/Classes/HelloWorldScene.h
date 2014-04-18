#ifndef __HELLOWORLD_SCENE_H__
#define __HELLOWORLD_SCENE_H__

#include "cocos2d.h"
#include "B2Sprite.h"
#include "Box2D/Box2D.h"

USING_NS_CC;

class HelloWorld : public cocos2d::CCLayer
{
public:
    // Here's a difference. Method 'init' in cocos2d-x returns bool, instead of returning 'id' in cocos2d-iphone
    virtual bool init();  

    // there's no 'id' in cpp, so we recommend returning the class instance pointer
    static cocos2d::CCScene* scene();
    
    // a selector callback
    void menuCloseCallback(CCObject* pSender);
    
    // implement the "static node()" method manually
    CREATE_FUNC(HelloWorld);

private:
	CCSize visibleSize;
	CCPoint origin;
	b2World* world;

	void initWorld();
	void addGround();
	void addBird();

};

#endif // __HELLOWORLD_SCENE_H__
