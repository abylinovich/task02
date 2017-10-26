package by.tc.task02.dao.xmltaghandler;

import by.tc.task02.entity.AbstractTag;
import by.tc.task02.entity.ContentTag;
import by.tc.task02.entity.ParentTag;

import java.util.Stack;
import java.util.regex.Matcher;

import static by.tc.task02.entity.TagType.PARENT_TAG;

public class ContentTagHandler implements ITagHandler {

    private static final int TAG_NAME_MATCHER_GROUP_NUMBER = 1;
    private static final int TAG_ATTRIBUTES_MATCHER_GROUP_NUMBER = 2;
    private static final int TAG_CONTENT_MATCHER_GROUP_NUMBER = 3;
    private static final int TAG_NAME_END_MATCHER_GROUP_NUMBER = 4;

    private Stack<AbstractTag> stack;
    private Matcher matcher;

    public ContentTagHandler(Stack<AbstractTag> stack, Matcher matcher) {
        this.stack = stack;
        this.matcher = matcher;
    }

    @Override
    public void handle() {
        if(matcher.find()) {
            String openTagName = matcher.group(TAG_NAME_MATCHER_GROUP_NUMBER);
            String tagAttributes = matcher.group(TAG_ATTRIBUTES_MATCHER_GROUP_NUMBER);
            String tagContent = matcher.group(TAG_CONTENT_MATCHER_GROUP_NUMBER);
            String closeTagName = matcher.group(TAG_NAME_END_MATCHER_GROUP_NUMBER);
            if(openTagName.equals(closeTagName)) {
                ContentTag tag = new ContentTag(openTagName);
                AttributeHandlerUtil.setAttributes(tag, tagAttributes);
                tag.setContent(tagContent);
                if(!stack.isEmpty()) {
                    if(stack.peek().getTagType() == PARENT_TAG) {
                        ((ParentTag) stack.peek()).addChild(tag);
                    }
                }

            }
        }
    }

}
