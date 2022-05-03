import os
import pefile
import sys
files = os.listdir("/workdir/malware_lab_1")
print("Malware files to analyze:")
print(files)
print()

for malware_file in files:
    pe = pefile.PE(malware_file)    
    functions = []    
    print("Currently analyzing %s" % malware_file)
    if hasattr(pe, 'DIRECTORY_ENTRY_EXPORT'):
        for exp in pe.DIRECTORY_ENTRY_EXPORT.symbols:
            # print("%s \t %s \t %s"  % (hex(exp.address + pe.OPTIONAL_HEADER.ImageBase), exp.name, exp.ordinal))
            functions.append( (hex(exp.address + pe.OPTIONAL_HEADER.ImageBase), exp.name, exp.ordinal) )    
    memory_offsets = {}
    memory_addresses = {}
    prev_address = 0    
    for function in functions:
        if function[0] not in memory_addresses:
            memory_addresses.update( {function[0]: 1} )
        else:
            repeats = memory_addresses.get(function[0]) + 1
            memory_addresses.update( {function[0]: repeats} )    
        offset = hex( int(function[0], 16) - prev_address )
        if offset in memory_offsets:
            repeats = memory_offsets.get(offset) + 1
            memory_offsets.update( {offset: repeats} )
        else:
            memory_offsets.update( {offset: 1} )    
        prev_address = int(function[0], 16)    
    for address in memory_addresses:
        if memory_addresses.get(address) > 2:
            print("Malware! More than 2 of the same memory address (%s) found!" % address)
            break    
    for offset in memory_offsets:
        if memory_offsets.get(offset) > 2:
             print("Malware! More than 2 of the same memory offset (%s) found!" % offset)
             break