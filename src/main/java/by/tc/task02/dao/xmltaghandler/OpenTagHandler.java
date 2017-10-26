package by.tc.task02.dao.xmltaghandler;

import by.tc.task02.entity.AbstractTag;
import by.tc.task02.entity.ParentTag;

import java.util.Stack;
import java.util.regex.Matcher;

import static by.tc.task02.entity.TagType.PARENT_TAG;

public class OpenTagHandler implements ITagHandler {

    private static final int TAG_NAME_MATCHER_GROUP_NUMBER = 1;
    private static final int TAG_ATTRIBUTES_MATCHER_GROUP_NUMBER = 2;

    private Stack<AbstractTag> stack;
    private Matcher matcher;

    public OpenTagHandler(Stack<AbstractTag> stack, Matcher matcher) {
        this.stack = stack;
        this.matcher = matcher;
    }

    @Override
    public void handle() {
        if(matcher.find()) {
            String tagName = matcher.group(TAG_NAME_MATCHER_GROUP_NUMBER);
            String tagAttributes = matcher.group(TAG_ATTRIBUTES_MATCHER_GROUP_NUMBER);
            ParentTag tag = new ParentTag(tagName);
            AttributeHandlerUtil.setAttributes(tag, tagAttributes);
            if(!stack.isEmpty()) {
                if(stack.peek().getTagType() == PARENT_TAG) {
                    ((ParentTag) stack.peek()).addChild(tag);
                }
            }
            stack.push(tag);
        }
    }

}
