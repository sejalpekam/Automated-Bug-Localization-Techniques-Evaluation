var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":39,"id":64362,"methods":[{"el":31,"sc":5,"sl":26},{"el":38,"sc":5,"sl":33}],"name":"Issue1939","sl":12},{"el":21,"id":64362,"methods":[],"name":"Issue1939.Container","sl":18}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4217":{"methods":[{"sl":26}],"name":"test_for_issue","pass":false,"statements":[{"sl":27}]},"test_492":{"methods":[{"sl":33}],"name":"test_for_issue_1","pass":false,"statements":[{"sl":34}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4217], [4217], [], [], [], [], [], [492], [492], [], [], [], [], []]
