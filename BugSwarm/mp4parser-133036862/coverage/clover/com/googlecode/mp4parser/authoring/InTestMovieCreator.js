var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":25,"id":25409,"methods":[{"el":23,"sc":5,"sl":11}],"name":"InTestMovieCreator","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_4":{"methods":[{"sl":11}],"name":"testFindDifferentFrameRates","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":22}]},"test_75":{"methods":[{"sl":11}],"name":"testFindSameFrameRate","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [4, 75], [4, 75], [4, 75], [4, 75], [4, 75], [4, 75], [4, 75], [], [], [], [], [4, 75], [], [], []]
