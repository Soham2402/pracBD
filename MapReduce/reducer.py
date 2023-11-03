import sys

word_counts = {}

for line in sys.stdin:
    line = line.strip()
    word, count = line.split('\t')
    count = int(count)

    if word in word_counts:
        word_counts[word] += count
        print(word_counts)
    else:
        word_counts[word] = count
        print(word_counts)
        

for word, count in word_counts.items():
    print('%s\t%s' % (word, count))
