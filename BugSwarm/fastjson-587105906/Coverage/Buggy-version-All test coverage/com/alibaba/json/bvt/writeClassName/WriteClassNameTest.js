var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":44,"id":93001,"methods":[{"el":13,"sc":5,"sl":11},{"el":25,"sc":5,"sl":15}],"name":"WriteClassNameTest","sl":9},{"el":39,"id":93011,"methods":[{"el":33,"sc":9,"sl":31},{"el":37,"sc":9,"sl":35}],"name":"WriteClassNameTest.A","sl":27},{"el":43,"id":93015,"methods":[],"name":"WriteClassNameTest.B","sl":41}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3863":{"methods":[{"sl":15},{"sl":31},{"sl":35}],"name":"test_list","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":22},{"sl":24},{"sl":32},{"sl":36}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3863], [3863], [3863], [3863], [3863], [3863], [], [3863], [], [3863], [], [], [], [], [], [], [3863], [3863], [], [], [3863], [3863], [], [], [], [], [], [], [], []]
